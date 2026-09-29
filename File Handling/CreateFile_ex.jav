public class CreateFile_ex{
    public static void main(String[]args){
        try{
            File file= new File("sample.txt");//this line not create file
            if(file.createNewFile()){       //throw IOException  // this method return boolean value
                System.out.println("file created successfully"+ file.getName());
            }else{
                System.out.println("File Already exits");
            }
        }catch(IOException e){
            System.out.println("An Error occurred while creating the file");
            e.printStackTrace();
        }
    }
}