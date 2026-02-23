public class Array {
    public static void main(String[] args){
        //string array
        String[] cars = {"bmw", "rolls royce", "honda" , "ap"};
        System.out.println(cars[0]);
        System.out.print(cars.length);
        //list all
//        for (int i=0; i< cars.length; i++){
//            System.out.println(cars[i]);
//        }
//        for (String i :cars){
//            System.out.println(i);
//        }
       int [][] numbers = {{1,2,3,4}, {5,6,7,8}};
//        System.out.println(numbers[0][1]);
//
        int i, j;
        for(i =0; i< numbers.length; ++i){
            for(j =0; j< numbers[i].length; ++j) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}
