package InfoSys_Interview;

public class Questions {
    public static void main(String[] args) {
        // 1st coding question
        String str = "Viv#$e!*^^k";
        // op -> Vivek

        String str1 = str.replaceAll("[^A-Za-z]", "");
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
/** Suppose there are 8 tabs are opened, and you need to navigate on 6th one need to verify the title of the page and then close it
 * https://www.youtube.com/watch?v=7xh371gk2ho
 */
// suppose there are one text box, and you are clearing the text from it, it is cleared from the UI but still present in DB, how to handle it
// Why you need to use JavaScript executor , when you have waits in selenium, what is the idea behind it, is there any specific reason?

/**
 *  Git pull --> automatically merges the fetched changes into the current branch
 *  Git fetch --> it just pull all the branches and does not merge the code
 */
//========================================
/**
 *   what interface you used in your framework while using selenium  -->
 *
 *   the core interface you'll interact with in most Selenium frameworks is the WebDriver interface.
 *
 *   While WebDriver is the main interface for interacting with the browser,
 *   Selenium also has other interfaces that provide specific functionalities. Some examples include:
 *
 * SearchContext: Provides methods for finding elements on a web page.
 * TakesScreenshot: Allows capturing screenshots of the browser window.
 * JavascriptExecutor: Enables executing JavaScript code within the browser.
 *
 *
 */