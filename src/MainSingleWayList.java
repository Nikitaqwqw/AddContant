

public class MainSingleWayList {

    public static void main(String[] args) {
        SingleWayList<Integer> singleWayList = new SingleWayList<>();
        singleWayList.add(1);
        singleWayList.add(2);

        for (Integer elem : singleWayList) {
            System.out.println(elem);
        }

    }

}
