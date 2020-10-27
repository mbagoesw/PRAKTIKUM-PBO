package com.pboreg;

// ini akan mengimport class console
import com.terminal.Console;

// mengimport static method dari console
import static com.terminal.Console.log;

public class Hierarki {
    public static void main(String[] args) {
        playerHierarki playerH = new playerHierarki("Otong");
        playerH.show();

        Console.log("Menampilkan data dengan console.log");
        Console.log(playerH.getName());

        log("Menampilkan data dengan log saja");
        log(playerH.getName());
    }
}

// ini tidak akan bisa, penggunaan private tidak diperkenankan
// private class Test{
// }
