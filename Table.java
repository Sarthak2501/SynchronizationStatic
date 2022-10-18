public class Table {
    synchronized static void PrintTable(int n){
        for(int i = 0; i <= 10 ; i++ ){
            System.out.println(n*i);
        }
    }
}