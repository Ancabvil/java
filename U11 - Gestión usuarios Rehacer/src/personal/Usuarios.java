package personal;
import java.io.File;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Usuarios implements CRUD<Usuario>{
    private String file;
    private int nextId;
    
    public Usuarios(String file) throws Exception{
        this.file = file;
        File _file = new File(file);
        if(!_file.exists())
            _file.createNewFile();
        ArrayList<Usuario> listaUsuarios = solicitarTodos();
        if (listaUsuarios.isEmpty()) {
            this.nextId = 1;
        } else {
            this.nextId = listaUsuarios.get(listaUsuarios.size()-1).getId()+1;
        }

    }
    
    public String getFile() {
        return file;
    }

    @Override
    public ArrayList<Usuario> solicitarTodos() {
        ArrayList<Usuario> listaUsuarios = new  ArrayList<>();
        String linea = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            linea=bf.readLine();
            while ((linea = bf.readLine()) != null) {
                listaUsuarios.add(new Usuario(linea));
            bf.close();
            }
        } catch (IOException io) {
            System.out.println("No se encuentra el usuario");
        }
        return listaUsuarios;
    }

    @Override
    public Usuario solicitarUno(int id){
        String linea = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            linea = bf.readLine();
            while ((linea = bf.readLine()) != null) {
                Usuario usuario = new Usuario(linea);
                if (usuario.getId() == id) {
                    bf.close();
                    return usuario;
                }
            }
            bf.close();
            
        } catch (IOException io) {
            System.out.println("No se encuentra el usuario.");
        }
        return null;
    }

    @Override
    public Usuario anadir(Usuario datos){
       // TODO Tienes que poder añadir un usuario al archivo
       // Debes comprobar que el usuario no existe (no puede haber dos usuarios con el mismo email)
       // En el caso de que ya existiera debe devolver un null
       // Si el usuario no existe entonces podemos añadir al usuario
       // Para que puedas añadir al usuario al final del archivo debes pasar un true cuando llames
       // al constructor de new FileWriter(nombre, true)
        ArrayList<Usuario> usuario = solicitarTodos();
        for (Usuario user : usuario) {
            if (user.getEmail().equals(datos.getEmail())) return null;
        }
         datos.setId(nextId); 
         nextId++;
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                bw.write(datos.serializar());
                bw.newLine();
                bw.close();

            } catch (IOException io) {
                System.out.println("Archivo no encontrado.");
            }
            return datos;            
        }   

    @Override
    public Usuario actualizar(int id, Usuario data){
        //  TODO Tienes que devolver los datos del usuario actualizados
        // Devolverá null si el usuario no existe en el fichero (si no se encuentra ese id)
        // Si el usuario se encuentra en el archivo entonces modificamos ese usuario en esa posición
        // del archivo.
        // Ayuda: Tienes que renombrar el archivo original añadiéndole .tmp al final
        // Luego abres en modo lectura el archivo temporal y abres en modo escritura el archivo original
        // Vas escribiendo las líneas del archivo temporal y cuando llegues al usaurio que quieres 
        // modificar escribes los datos de ese usuario
        // Sigue hasta que consumas todas las líneas del archivo temporal
        // Al final del proceso debes borrar el archivo temporal
        // Con esto habrás modificado los datos de ese usuario 
        ArrayList<Usuario> usuarios = solicitarTodos();
        boolean actualizado = false;

        for(int i = 0; i < usuarios.size() && !actualizado; i++){
            if (usuarios.get(i).getId() == id) {
                actualizado = true;
                data.setId(id);

                File temporal = new File(file);
                temporal.renameTo(new File(file + ".tmp"));
                try {
                    BufferedReader br = new BufferedReader(new FileReader(file + ".tmp"));
                    BufferedWriter bf = new BufferedWriter(new FileWriter(file));
                    String linea = "";
                    Usuario usuarioNUsuario;
                    while ((linea = br.readLine()) != null) {
                        usuarioNUsuario = new Usuario(linea);
                        if (usuarioNUsuario.getId() == data.getId()) {
                            usuarioNUsuario = data;
                        }
                        
                        temporal.deleteOnExit();
                        return data;
                    }
                    br.close();
                    bf.close();
                } catch (IOException io){
                    System.out.println("Los datos de " + file + " son erroneos.");
                }
            }
        }
        return null;
    }

    @Override
    public Usuario borrar(int id){
        //  TODO Tienes que devolver los datos del usuario borrado
        // Devolverá null si el usuario no existe en el fichero (si no se encuentra ese id)
        // Si el usuario se encuentra en el archivo entonces eliminamos esa línea del archivo
        // Ayuda: Tienes que renombrar el archivo original añadiéndole .tmp al final
        // Luego abres en modo lectura el archivo temporal y abres en modo escritura el archivo original
        // Vas escribiendo las líneas del archivo temporal y cuando llegues al usaurio que quieres 
        // borrar te saltas la escritura de esa línea
        // Sigue hasta que consumas todas las líneas del archivo temporal
        // Al final del proceso debes borrar el archivo temporal
        // Con esto habrás borrado al usuario
        ArrayList<Usuario> usuarios = solicitarTodos();
        boolean borrado = false;
        
        for (int index = 0; index < usuarios.size() && !borrado; index++) {
            if (usuarios.get(index).getId() == id) {
                Usuario usuarioBorrado = usuarios.get(index);
                borrado = true;
                File archivo = new File(file);
                File tempFile = new File(file + ".temp");
                archivo.renameTo(tempFile);
                archivo = new File(file);
        
                try {
                    BufferedReader bf = new BufferedReader(new FileReader(file + ".tmp"));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    String linea = "";
                    Usuario usuario;
        
                    while ((linea = bf.readLine()) != null)  {
                        usuario = new Usuario(linea);
                        if (usuario.getId() != id) {
                            bw.write(usuario.serializar());
                            bw.newLine();
                        }
                    }
                    bf.close();
                    bw.close();
        
                    tempFile.delete();
                    return usuarioBorrado;
                } catch(IOException io){
                    System.out.println("Error en la introducción de datos en " + file);
                }
            }
        }
                return null;
        }
}
