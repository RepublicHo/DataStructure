package MultiThread;

import java.io.*;
import java.util.Date;

/**
 * @Author Anthony Z.
 * @Date 26/8/2022
 * @Description: Suppose our web server
 * keeps a logfile. This class doesnt use
 * multiple threads. However, if the web server
 * uses multiple threads to handle incoming connections,
 * then each of those threads will need to access the same logfile
 * and consequently to the same Logfile object.
 *
 * The problem occurs if two or more threads each have a reference to
 * the same LogFile object, and one of those threads interrupts
 * anotehr in the process of writing data.
 *
 * The solution, again, is synchronization.
 *
 * Here are some good choice for which object to synchronize on,
 * The first choice is on the Writer object out, because all the
 * threads that use this LogFile object also use the same out
 * object that's part of that LogFile.
 *
 * Furthermore, it's the writeEntry() method that needs to be protected
 * from interruption.
 *
 *
 * The second possibility is to synchronize on the LogFile object
 * itself. This is simple enough to arrange with the this keyword.
 */
public class LogFile {
    private Writer out;
    public LogFile(File f) throws IOException{

        FileWriter fw = new FileWriter(f);
        this.out = new BufferedWriter(fw);
    }
    public void writeEntry(String message) throws IOException{
        synchronized (out/*this*/){
            Date date = new Date();
            out.write(date.toString());
            out.write('\t');
            out.write(message);
            out.write("\r\n");
        }

    }
    public void close() throws IOException{
        out.flush();
        out.close();
    }
}
