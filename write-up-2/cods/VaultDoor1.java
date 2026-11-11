class VaultDoor1 {
    public static void main(String args[]) {
        VaultDoor1 vaultDoor = new VaultDoor1();
        String password = vaultDoor.checkPassword();
        System.out.println("academy{" + password + "}");
    }

    // I came up with a more secure way to check the password without putting
    // the password itself in the source code. I think this is going to be
    // UNHACKABLE!! I hope Dr. Evil agrees...
    //
    // -Minion #8728
    public String checkPassword() {
        StringBuilder password = new StringBuilder();
        password.setLength(32);
        password.setCharAt(0, 'd');
        password.setCharAt(29, 'f');
        password.setCharAt(4, 'r');
        password.setCharAt(2, '5');
        password.setCharAt(23, 'r');
        password.setCharAt(3, 'c');
        password.setCharAt(17, '4');
        password.setCharAt(1, '3');
        password.setCharAt(7, 'b');
        password.setCharAt(10, '_');
        password.setCharAt(5, '4');
        password.setCharAt(9, '3');
        password.setCharAt(11, 't');
        password.setCharAt(15, 'c');
        password.setCharAt(8, 'l');
        password.setCharAt(12, 'H');
        password.setCharAt(20, 'c');
        password.setCharAt(14, '_');
        password.setCharAt(6, 'm');
        password.setCharAt(24, '5');
        password.setCharAt(18, 'r');
        password.setCharAt(13, '3');
        password.setCharAt(19, '4');
        password.setCharAt(21, 'T');
        password.setCharAt(16, 'H');
        password.setCharAt(27, '3');
        password.setCharAt(30, '6');
        password.setCharAt(25, '_');
        password.setCharAt(22, '3');
        password.setCharAt(28, 'f');
        password.setCharAt(26, 'e');
        password.setCharAt(31, '3');
        return password.toString();
    }
}