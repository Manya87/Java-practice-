public class Main1 {
    public static void main(String[] args) {
        String[] names = {"manya", "reva", "college"};
        char target = 'n';

        boolean result = search(names, target);
        System.out.println("Character found: " + result);
    }

    static boolean search(String[] names, char target) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                if (names[i].charAt(j) == target) {
                    System.out.println("Character '" + target + "' found in: " + names[i]);
                    return true;
                }
            }
        }
        return false;
    }
}
