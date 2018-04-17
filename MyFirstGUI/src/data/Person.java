package data;



import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Person {


	public static void write2json()  {
		try {
			Writer writer = new FileWriter("C:\\temp\\output2.json");
			Gson gson = new GsonBuilder().serializeNulls().create();
			gson.toJson(Person.getPersonenliste(), writer);
			
			writer.close();

	} catch (IOException e1) {
		e1.printStackTrace();
	}

	}

	private static ArrayList<Person> personenliste = new ArrayList<>();

	public static ArrayList<Person> getPersonenliste() {
		return personenliste;
	}

	private String vorname;
	private String nachname;
	private String adresse;
	private int Postleitzahl;
	private String Ort;

	public String getOrt() {
		return Ort;
	}

	public void setOrt(String ort) {
		Ort = ort;
	}

	public int getPostleitzahl() {
		return Postleitzahl;
	}

	public void setPostleitzahl(int postleitzahl) {
		Postleitzahl = postleitzahl;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String toString() {
		return getVorname() + "\n" + getNachname() + "\n" + getAdresse() + "\n" + getPostleitzahl() + "\n" + getOrt();
	}
}
