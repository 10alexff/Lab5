package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {

        Read_and_Write();

    }

    public static void Read_and_Write()
    {
        try
        {

            ArrayList<String> stroka = new ArrayList<String>();
            ArrayList<String> stroka_U = new ArrayList<String>();

            BufferedReader reader = new BufferedReader(new FileReader("E:\\JavaLabs\\1.txt"));

            String s;
            for(;;)
            {
                s=reader.readLine();
                if(s!=null){stroka.add(s);  /* System.out.println(s);*/}
                else{break;}
            }
            reader.close();
            String min;
            int index = 0;
            int SiZE =stroka.size();
            for(int i=0;i<SiZE;i++)
            {
                min = stroka.get(0);
                index =0;
                for(int j=1;j<stroka.size();j++)
                {
                    if(min.length()>stroka.get(j).length())
                    { min=stroka.get(j); index = j;}
                }

                stroka_U.add(min);
                stroka.remove(index);
            }

            BufferedWriter write = new BufferedWriter(new FileWriter("E:\\JavaLabs\\2.txt"));

            for(int i =0;i<stroka_U.size();i++)
            {
                write.write(stroka_U.get(i));
                //System.out.println(stroka_U.get(i));
                write.newLine();
            }

            write.close();



        }

        catch(IOException ex)
        {

            System.out.println(ex.getMessage());
        }

    }

}
