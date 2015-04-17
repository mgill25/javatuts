package com.company;

/**
 * HelloIdea.
 * I/O Tutorial: ByteStreams
 *
 * Programs use bytestreams to perform input and output of 8-bit bytes.
 * All bytestream classes descend from InputStream and OutputStream
 *
 * There are many different kinds of streams. For example, for file I/O,
 * we have FileInputStream, and FileOutputStream. Other bytestreams
 * are used in a similar way, mainly differing in the way they are constructed.
 *
 * When not to use ByteStreams:
 *  CopyBytes actually represents a low-level operation that should be avoided.
 *  Since xanadu.txt contains character bytes, the best approach would be to use *character streams*.
 *  They will require classes FileReader and FileWriter instead of FileInputStream and FileOutputStream.
 *  Similarly, in order to do line-based streams, BufferedReader and PrintWriter can be used.
 *  There are also streams for more complicated data types.
 *
 *  Byte Streams should be only used for the  most primitive I/O operations.
 *
 *  However, all other stream types are built using byte streams!
 *
 * Created by manish on 16/04/15.
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            /*
            If a stream is no longer needed, it must be closed. This practice avoids
            serious resource leaks.
            One possible error is that the CopyBytes is unable to open one or both of the files.
            When that happens, the variables in and out always remain null. Hence, we do a null-check
            inside the finally block before invoking .close().
             */
            if (in != null) {
                in.close();
            }

            if (out != null) {
                out.close();
            }
        }
    }
}
