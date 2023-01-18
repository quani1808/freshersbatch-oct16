/*program 4 in java 11*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
        public class StudentList
        {
            public static void main(String[] args)
            {
                var path="C:\\Users\\madnagal\\Nagalakshmi\\StudentList.txt";
                try
                {
                    String data = Files.readString(Path.of(path));
                    System.out.println(data);
                    long numberoflines=data.lines().count();
                    System.out.println(numberoflines) ;
                }catch(IOException e)
                {
                    e.printStackTrace();
                }
            }


        }
