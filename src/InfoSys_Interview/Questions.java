package InfoSys_Interview;

public class Questions {
    public static void main(String[] args) {
        // 1st coding question
        String str = "Viv#$e!*^^k";
        // op -> Vivek

        String str1 = str.replaceAll("[^A-za-z]", "");
        System.out.println(str1);

        // 2nd coding question
//        String str = "I am in Noida";
//       // Output: adioN ni ma I
//        String [] str1 = str.split(" ");
//        String newStr="";
//        for(int i =str1.length-1;i>=0;i--){
//            String st2 = str1[i];
//            for(int j=st2.length()-1;j>=0;j--){
//                newStr=newStr+st2.charAt(j);
//            }
//            newStr=newStr+" ";
//        }
//        System.out.println(newStr);
//    }
    }
}


// Need to write the xpath for footWear
//h2[contains(text(),'Up to 60% off | Styles for men')]/parent::div/following-sibling::div//span[contains(text(),'Footwear')]

// What is Selenium Grid
// how you are running your test Automation suite -> Means where you are running, so I answer the question we have dedicated VMs
// post vs put
// git pull vs git fetch
// what interface you used in your framework while using selenium
// what is encapsulation and how you used in your selenium framework
// what kind of collections you have used in your framework
// Suppose there are 8 tabs are opened, and you need to navigate on 6th one need to verify the title of the page and then close it
// suppose there are one text box, and you are clearing the text from it, it is cleared from the UI but still present in DB, how to handle it
// Why you need to use JavaScript executor , when you have waits in selenium, what is the idea behind it, is there any specific reason?