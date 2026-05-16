package topic8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListsInAction2 {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        // shoppingList.add("coffee");
        Collections.addAll(shoppingList, "coffee", "orange juice", "bread", "butter", "bread", "eggs");

        // while (shoppingList.remove("corek"))
        // ;
        // shoppingList.remove(2);
        // System.out.println(shoppingList);

        ArrayList<String> newShoppingList = new ArrayList<>(shoppingList);
        Collections.addAll(newShoppingList, "apple", "kiwi");

        // manual copy
        // for(var item : shoppingList){
        // newShoppingList.add(item);
        // }

        System.out.println(newShoppingList);

        System.out.println(
                newShoppingList.contains("tea")
                        ? "Cay var"
                        : "Cay yoxdur");
        // boolean isFound = false;
        // for (var item : newShoppingList) {
        // if (item.equals("soup")) {
        // System.out.println("Sorba var");
        // isFound = true;
        // break;
        // }
        // }
        // if (!isFound) {
        // System.out.println("uzrlu say, sorba yoxdur");
        // }

        LinkedList<String> newLinkedList = new LinkedList<>();
        Collections.addAll(newLinkedList, "tomato", "potato");
        newLinkedList.addAll(newShoppingList);

        System.out.println("Birincini sildim: " + newLinkedList.removeFirst());
        newLinkedList.addLast("pomidor-yumurta");
        System.out.println(newLinkedList);
    }
}
