public class AplikasiTodoList {

    
    public static String[] model = new String[10];

    // Input dari user
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
     
        
        viewShowTodoList();
      

    }

    // Bisnis logik

    /**
     * Menampikan todo list
     */

    public static void showTodoList() {

        System.out.println("TODOLIST");
        for(var i= 0; i< model.length; i++){
            var todo = model[i];
            var no = i+1;


            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }

    }
    // public static void testShowTodoList(){
    //     model[0] = "Belajar Java Dasar";
    //     model[1] = "Studi Kasus Java : Aplikasi TodoList";
    //     showTodoList();
    // }

    /**
     * Menambah todo list
     */

    public static void addTodoList(String todo){

    // Cek apakah model penuh?
    var isFull = true;
    for (int i = 0;  i < model.length; i++){
        if(model[i] == null){
            // Model masih ada yang kosong
            isFull = false;
            break;
        }
    }


    // Jika isFull kita rezise ukuran array 2 kali lipat

    if(isFull){
     var temp = model;
        model = new String[model.length * 2];

// Pindahkan temporary ke model baru
        for (int i  = 0; i < temp.length; i++){
            model[i] = temp[i];
        }
    }
        // Tambahkan ke posisi yang data array nya NULL
        for (var i = 0; i <model.length; i++){
            if (model[i] == null) {
                model[i] = todo;
                break;

            }
        }

    }

    // public static void testAddTodoList() {

    //     for(int i = 0; i < 25; i++){
    //         addTodoList("Contoh Todo ke ." + i);
    //     }
    //     showTodoList();
    // }

    
    /**
     * Menghapus todo list
     */

    public static boolean removeTodoList(Integer number) {

        // Validasi/pengecekan
        if((number -1) >= model.length){
            return false;
        }

       else if(model[number -1] == null){
            return false;
        }
        else {
          
            // Satu
            // dua
            // null

            for(int i = (number -1); i < model.length; i++){
                if(i == (model.length -1)) {
                    model[i] = null;
                }  else {
                     model[i] = model[i+1];
                }
           
            }
            return true;
        }

    }

    // public static void testRemoveTodoList(){
    //     // addTodoList("Satu");
    //     // addTodoList("Dua");
    //     // addTodoList("Tiga");
    //     // addTodoList("Empat");
    //     // addTodoList("Lima");
    //     // addTodoList("Empat");
    //     // addTodoList("Lima");

    //     var result = removeTodoList(20);
    //     System.out.println(result);

    //     result = removeTodoList(7);
    //     System.out.println(result);

    //     result = removeTodoList(2);
    //     System.out.println(result);

    //     showTodoList();
    // }


    public static String input(String info) {

        System.out.print(info + " : ");
        // Menerima input data dari user
        String data = scanner.nextLine();
        return data;


    }

    // public static void testInput(){
    //     var name = input("Nama");
    //     System.out.println("Hi " + name);

    //     var channel = input ("Channel");
    //     System.out.println(channel);
         

    // }
    /**
     * Menampilkan view todo list
     */

    public static void viewShowTodoList(){
        while(true){       
        showTodoList();

        System.out.println("Menu :  ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. Keluar");

        var input = input ("Pilih");
        if(input.equals("1")){
            viewAddTodoList();
        }
        else if(input.equals("2")){
            viewRemoveTodoList();
        }
        else if(input.equals("x")){
            System.out.println("Anda telah keluar");
            break;
           
            
        }
        else {
            System.out.println("Pilihan tidak dimengerti");
            break;
           
        }
    }
    }

    // public static void testViewShowTodoListt(){
    //     addTodoList("Satu"); 
    //     addTodoList("Dua");
    //     addTodoList("Tiga");
    //     addTodoList("Empat");
    //     addTodoList("Lima");  

    //     viewShowTodoList();
       
    // }
    /**
     * Menampilkan view  menambahkan todo list
     */
    public static void viewAddTodoList(){
        System.out.println("Menambah TodoList ");
        var todo  = input("x jika batal ");

        if(todo.equals("x")){
            // Batal
        }
        else {
            addTodoList(todo);
        }


    }

    public static void testViewAddTodoList(){
        viewAddTodoList();
        showTodoList();
    }
    
    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList(){
        System.out.println("Menghapus TodoList");

        // Menerima input dari  user
        var number = input("Nomor yang dihapus");
        

        if(number.equals("x")){
            // Batal
            
        }
        else{
            // Cek result
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success){
                // Jika gagal
                System.out.println("Gagal menghapus todolist : " + number);
                
            }

        }

    }


    public static void testViewRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");


        showTodoList();
        viewRemoveTodoList();
        showTodoList();
    }
    
}
