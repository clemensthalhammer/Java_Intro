package gui;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.google.gson.reflect.TypeToken;

import data.Person;

public class JSONTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Writer writer = new FileWriter("C:\\temp\\output.json");
			Gson gson = new GsonBuilder().serializeNulls().create();
			Reader reader = new FileReader("C:\\temp\\output.json");
			//gson.toJson("Hallo", writer);
			//gson.toJson(12345, writer);
			//
			Person p = new Person();
			p.setVorname("Max");
			p.setNachname("Mustermann");
			Person.getPersonenliste().add(p);
			//
			gson.toJson(Person.getPersonenliste(), writer);
			//
			writer.close();
			//
			ArrayList<Person> personenread = new ArrayList<>();
			Type listType = new TypeToken <ArrayList<Person>>(){}.getType();
			personenread = gson.fromJson(reader,listType);
			for (int i = 0; i < personenread.size(); i++) {

				System.out.println(personenread.get(i));
			};
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
