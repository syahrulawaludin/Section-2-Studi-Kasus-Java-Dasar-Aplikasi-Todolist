public class AplikasiTodoList {

    
    public static String[] model = new String[10];

    public static void main(String[] args) {
     
        
        testShowTodoList();
      



    }

    // Bisnis logik

    /**
     * Menampikan todo list
     */

    public static void showTodoList() {
        for(var i= 0; i< model.length; i++){
            var todo = model[i];
            var no = i+1;


            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }

    }
    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java : Aplikasi TodoList";
        showTodoList();
    }

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
    /**
     * Menghapus todo list
     */

    public static void removeTodoList() {

    }

    /**
     * Menampilkan view todo list
     */

    public static void viewShowTodoList(){


    }
    /**
     * Menampilkan view  menambahkan todo list
     */
    public static void viewAddTodoList(){

    }
    
    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRremoveTodoList(){

    }
    
}
