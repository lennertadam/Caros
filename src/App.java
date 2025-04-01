
public class App {
    public static void main(String[] args) throws Exception {
        Store.readCsvFile();
        Solution sol=new Solution();
        sol.sumPrice();
        sol.countLada();
        sol.isThereCitroen();
        sol.positionOfCitroen();
        sol.positionOfLada();
        sol.ladaSelection();
        sol.selection();
    }
}
