package com.khoinguyen.array;

public class ArrayV1 {

  public static void main(String[] args) {
    //đến xem có bao nhiêu phần tử lặp lại / kinh điển
    /**
     2: 2
     3: 2
     4: 2
     5: 2
     6: 1
     7: 1
     8: 1
     44: 1
     55: 1
     66: 1
     */

    int[] array = new int[]{2, 3, 4, 5, 6, 7, 8, 2, 3, 4, 5, 1, 44, 55, 66, 1, 1};
    boolean[] visit = new boolean[array.length];
    //visit = new int[]{2, 3, 4, 5, 6, 7, 8, true, 3, 4, 5, 1, 44, 55, 66, 1, 1};
    for (int i = 0; i < array.length; i++) {
      if(visit[i]) {
        continue;
      }
      int count = 1;
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] == array[j]) {
          visit[j] = true;
          count++;
        }
      }
      System.out.printf("Lan xuat hien cua so %s la %s \n", array[i], count);
    }



    //tìm số chẵn trong mảng
    //in mảng chẵn mảng lẻ

//    int[] array = new int[] {1, 4, 7, 8, 33, 44 , 8};
//
//
//    int[] mangChan = new int[array.length];
//    int indexMangChan = 0;
//
//    int[] mangLe = new int[array.length];
//    int indexMangLe = 0;
//
//    for (int i = 0; i < array.length; i++) {
//      if(array[i]%2 == 0){
//        mangChan[indexMangChan++] = array[i];
//      }
//      else{
//        mangLe[indexMangLe++] = array[i];
//      }
//    }
//
//    System.out.println("Mang Chan");
//    for (int i = 0; i < mangLe.length; i++) {
//      System.out.print(mangChan[i] + " ");
//    }
//    System.out.println();
//    System.out.println("Mang Le");
//    for (int i = 0; i < mangLe.length; i++) {
//      System.out.print(mangLe[i] + " ");
//    }

    //nhập mảng
//    Scanner sc = new Scanner(System.in);
//    int[] arr = new int[5];
//
//    for (int i = 0; i < 5; i++) {
//      System.out.print("Enter number " + (i + 1) + ": ");
//      arr[i] = sc.nextInt();
//    }
//
//    for (int i = 0; i < 5; i++) {
//      System.out.println(arr[i]);
//    }
//
  }

//  int[] arr = {1, 2, 3, 4, 5};
//  int[] arr2 = new int[10];
//  //bốc phần tử arr sang arr2
//
//    for (int i = 0; i < arr2.length; i++) {
//    if(i == 5) {
//      break;
//    }
//    arr2[i] = arr[i];//5
//  }
//
//    for (int i = 0; i < arr2.length; i++) {
//    System.out.print(arr2[i] + " ");
//  }
}
