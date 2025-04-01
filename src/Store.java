import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public static ArrayList<Car> readCsvFile(){
        try {
            return tryReadCsvFile();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<Car> tryReadCsvFile() throws FileNotFoundException{
        File file=new File("cars2.csv");
        ArrayList<Car> carList=new ArrayList<>();
        
        try(Scanner scanner = new Scanner(file)){
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line=scanner.nextLine();
                String[] array=line.split(",");
                Car car=new Car();
                car.setId(Integer.parseInt(array[0]));
                car.setPlate(array[1].replaceAll("\"", "").trim());
                car.setBrand(array[2].replaceAll("\"", "").trim());
                car.setYear(Integer.parseInt(array[3].trim()));
                car.setPrice(Double.parseDouble(array[4]));
                carList.add(car);
            }
        }
        return carList;    
}
}
