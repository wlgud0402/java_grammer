public class Array {
    public static void main(String[] args){
        int[] myArray = {1, 33, 4, 12, 89, 98, 90, 14, 43, 1234}; //배열만들어줄때 []로 만듦 그 앞에 type을 붙이는데 띄어쓰기X 붙여쓰기
        String[] names = {"james","anthony","rodrigo","mary"};

        int[] newArray = new int[4]; //Array 배열의 크기를 정해줌 => 4개의 요소밖에 들어갈 수 없음.
        String[] newNames = new String[5];

        newArray[0] = 12;
        newArray[1] = 13;
        newArray[2] = 133;
        newArray[3] = 113;

        for (int i = 0; i<newArray.length; i++){  //length만큼 반복
            System.out.println("Items: "+ myArray[i]);//Array로 for문 돌기
        }


        //[12,13,133,113]

        for (int i = 0; i<myArray.length; i++){
            System.out.println("Items: "+ myArray[i]);
        }

        System.out.println(myArray[2]);
        System.out.println(names[0]);

        //Array Lists
        //ArrayList<String> name = new ArrayList<>();

        ArrayList name = new ArrayList(); //위에형태의 경우 <String>라고 type을 정해주었으므로 만약 int가 들어가면 오류가 일어남

        name.add(1);
        name.add("Bonni");
        name.add("Arnold");
        name.add("Bond");
        name.add("James");

        for (int i = 0; i<name.size(); i++){  //ArrayList에는 length가 없음 => 대신 size(
            System.out.println("Names: " +name.get(i));
        }

        //Clever for loop
        for(Object n : name){

            System.out.println("Clever for loop: "+n);
        }

        name.remove(0); //0번째 위치의 값 제거
        System.out.println(name);

        System.out.println(name.get(0)); //위치의 값 얻기

    }
}