package coreClass;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

public interface IOUtils {

	static void storePropertyDetails(Set<Owner> owner, String fileName) {

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(fileName)))) {

			out.writeObject(owner);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	static Set<Owner> restorePropertyDetails(String fileName) {

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
			return (Set<Owner>) in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return new HashSet<Owner>();
		}
	}

}
