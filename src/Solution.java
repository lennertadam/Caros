import java.util.ArrayList;

public class Solution {
    ArrayList<Car> carList;

    public void solve(){}

    public void sumPrice(){
        carList=Store.readCsvFile();
        Double total=0.0;
        for (Car car : carList) {
            total=total+car.getPrice();
        }
        System.out.println(total);
        
    }

        //Hány darab lada van
    public void countLada(){
        carList=Store.readCsvFile();
        int counter=0;
        for (Car car : carList) {
            if (car.getBrand().equals("Lada")) {
                counter++;
            }
        }

        System.out.println("A ladák száma: "+counter);
    }

        //van-e citroen
    public void isThereCitroen(){
        carList=Store.readCsvFile();

        /*
        boolean citroenFound=false;
        
        for (Car car : carList) {
            if (car.getBrand().equals("Citroen")) {
                citroenFound=true;
                break;
            }
        }
        if (citroenFound) {
            System.out.println("Van Citroen a listában");
        }
        else{
            System.out.println("Nincs Citroen a listában");
        }
        */
        int i=0;
        int n=carList.size();
        String target="Citroen";
        while (i<n && (!carList.get(i).getBrand().equals(target))) {
            i++;
        }
        if (i<n) {
            System.out.println("Van "+target);
        }
        else{
            System.out.println("Nincs "+target);
        }
    }

        //Hányadik helyen van a Citroen
    public void positionOfCitroen(){
            carList=Store.readCsvFile();
            int i=0;
            String target="Citroen";
        while ((!carList.get(i).getBrand().equals(target))) {
            i++;
        }
        System.out.println("A "+target+" a "+(i+1)+" helyen van.");

    }
    
        //Lada keresése (+index)
    public void positionOfLada(){
        carList=Store.readCsvFile();
        int i=0;
        int n=carList.size();
        String target="Lada";
        while (i<n && (!carList.get(i).getBrand().equals(target))) {
            i++;
        }
        if (i<n) {
            System.out.println("Van "+target+". Indexe: "+i);
        }
        else{
            System.out.println("Nincs "+target+".");
        }
    }
    
    //ladák kiválasztása
    public void ladaSelection(){
        carList=Store.readCsvFile();
        ArrayList<Car> ladaList=new ArrayList<>();
        for (Car car : carList) {
            if (car.getBrand().equals("Lada")) {
                ladaList.add(car);                
            }
        }
        outputList(ladaList);
        //for(int i=0;i<carList.size();i++){}
    }

    public void outputList(ArrayList<Car> list){
        for (Car car : list) {
            System.out.printf("%s %s %.2f\n",car.getPlate(),car.getBrand(),car.getPrice());
        }
    }

    public void selection(){
        ArrayList<Car> expensiveList=new ArrayList<>();
        ArrayList<Car> cheapList=new ArrayList<>();
        // int j=0;
        // int k=0;
        for (Car car : carList) {
            if (car.getPrice()>=1000) {
                expensiveList.add(car);
            }
            else{
                cheapList.add(car);
            }
        }
        System.out.println("---");
        System.out.println("Drága autók listája: ");
        outputList(expensiveList);
        System.out.println("Olcsó autók listája: ");
        outputList(cheapList);
    }


}

