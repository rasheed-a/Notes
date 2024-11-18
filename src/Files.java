/* 
File f = new File(*file name*); - Creates an object for a file so you can access the file (* - string)

FileOutputStream fos = new FileOutputStream(f); - Creates output stream so we can send data into a file

ObjectOutputStream stream = new ObjectOutputStream(fos); - allows us to send objects into the file

stream.writeObject(object);

import java.io.*;
*/

/**
FileNotFoundException - reading file
10Exception - reading/writing file
ClassNotFoundException - reading object from file 
 **/

//object reference var = stream.readObject(); - stream must be an input stream