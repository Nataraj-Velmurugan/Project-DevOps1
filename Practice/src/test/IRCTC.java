package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class IRCTC 

{
	
	      
public static void main (String [] args) throws InterruptedException
            
            {
	
	
                        WebDriver driver=new FirefoxDriver();

//                      System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64 bit.exe");
                        
         
                        //ChromeDriver driver = new ChromeDriver();
                        
                        
                                      
                        driver.manage().window().maximize();
                        
                        driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
                        
                        
                        
                        Thread.sleep(2000);
                        
                        driver.findElement(By.xpath("//*[@id='demon_content']/div[2]/input")).click();
                        
                        Thread.sleep(3000);
                        
                        driver.findElement(By.xpath("//*[@id='loginFormId']/div[1]/div[4]/div/ul/li[2]/a")).click();
                        
                        Thread.sleep(3000);
                        
                        driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("fgh987");
                        
                        driver.findElement(By.id("userRegistrationForm:password")).sendKeys("fgh987");
                        
                        driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("fgh987");
                        
                        WebElement src = driver.findElement(By.id("userRegistrationForm:securityQ"));
                        
                        Select dropdown = new Select(src);
                        
                        dropdown.selectByValue("1");
                        
                        driver.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys("school");
                        
                        driver.findElement(By.id("userRegistrationForm:firstName")).sendKeys("abc");
                        
                        driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys("def");
                        

                        WebElement radioBtn = driver.findElement(By.id("userRegistrationForm:gender:0"));
 
                        radioBtn.click();
                        
                        WebElement radioBtn1 = driver.findElement(By.id("userRegistrationForm:maritalStatus"));
                        
                        radioBtn1.click();
                        
        WebElement src1 = driver.findElement(By.id("userRegistrationForm:dobDay"));
                        
                        Select dropdown1 = new Select(src1);
                        
                        dropdown1.selectByValue("08");
                        
                        
                         WebElement src2 = driver.findElement(By.id("userRegistrationForm:dobMonth"));
                                    
                         Select dropdown2 = new Select(src2);
                                    
                         dropdown2.selectByValue("11");
                         
                         
                         WebElement src3 = driver.findElement(By.id("userRegistrationForm:dateOfBirth"));
                                    
                         Select dropdown3 = new Select(src3);
                                    
                         dropdown3.selectByValue("1991");
                         
                         WebElement src4 = driver.findElement(By.id("userRegistrationForm:occupation"));
                                    
                         Select dropdown4 = new Select(src4);
                                    
                         dropdown4.selectByValue("0");
                         
                         driver.findElement(By.xpath("//*[@id='userRegistrationForm:uidno']")).sendKeys("987654321");
                         
                         driver.findElement(By.id("userRegistrationForm:idno")).sendKeys("123456789");
                         
                         driver.findElement(By.id("userRegistrationForm:email")).sendKeys("abc@gmail.com");
                         
                         driver.findElement(By.id("userRegistrationForm:mobile")).sendKeys("456987321");
                         
                         
                         WebElement src5 = driver.findElement(By.id("userRegistrationForm:nationalityId"));
                                    
                         Select dropdown5 = new Select(src5);
                                    
                         dropdown5.selectByValue("94");
                         
                         driver.findElement(By.id("userRegistrationForm:address")).sendKeys("VPS salai");
                         
                         driver.findElement(By.id("userRegistrationForm:street")).sendKeys("OPR plot");
                         
                         driver.findElement(By.id("userRegistrationForm:area")).sendKeys("Vadalur");
                         
                         WebElement src6 = driver.findElement(By.id("userRegistrationForm:countries"));
                                    
                         Select dropdown6 = new Select(src6);
                                    
                         dropdown6.selectByValue("94");
                         
                         driver.findElement(By.id("userRegistrationForm:pincode")).sendKeys("607303");
                         
                          Thread.sleep(10000);
                          driver.findElement(By.id("userRegistrationForm:statesName")).click();
                         //driver.close();
                         
//                        driver.findElement(By.id("userRegistrationForm:statesName")).click();
                         
//                        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//
                          System.out.println("A");
//                      
//                        ................................................................................................................
//                      for (int second = 0;; second++)
//                                  {
//                                  System.out.println("111");
//                             if (second >= 60)
//                                     fail("timeout");
//                                try { 
//                                         Select droplist = new Select(driver.findElement(By.id("userRegistrationForm:cityName")));
//                                         if(!droplist.getOptions().isEmpty()){
//                                          break;
//                                    }
//                           } catch (Exception e) {
//                               // best put something here
//                          }
//                          Thread.sleep(1000);
//                      }
//                        
//                        
//                      WebElement src7=driver.findElement(By.id("userRegistrationForm:cityName"));
//                      Select dropdown7 = new Select(src7);
//                      dropdown7.selectByValue("Cuddalore");
//                        ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
                          
//                                  .....................................................................................
                                     
                                      Thread.sleep(3000);
                                      
                                     By byId = By.id("userRegistrationForm:cityName");
            System.out.println("VVVv");
                                    //use explicit wait to make sure the element is there
            						WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                                      .until(ExpectedConditions.presenceOfElementLocated(byId));
            System.out.println("MMMMM");
                                    Select dropdown11 = new Select(myDynamicElement);
                                    dropdown11.selectByValue("Cuddalore");
                                     
//                                  .....................................................................................
                                     
                         
                          
                          
////                     
//                        WebElement src7=driver.findElement(By.id("userRegistrationForm:cityName"));
//                                  Select dropdown7 = new Select(src7);
//                                  dropdown7.selectByIndex(1);
                          
                          System.out.println("B");
                          
                          Thread.sleep(2000);
//                      ...............................................................................................................
                         
                         
//                      WebElement src7=driver.findElement(By.id("userRegistrationForm:cityName"));
//                      Select dropdown7 = new Select(src7);
//                      System.out.println("A");
//                      
//                      
//                      dropdown7.selectByIndex(1);
//                      
//                      
                         WebElement src8 = driver.findElement(By.id("userRegistrationForm:postofficeName"));
                         
                         Select dropdown8 = new Select(src8);
                         
                         dropdown8.selectByIndex(6);
                         
                         driver.findElement(By.id("userRegistrationForm:landline")).sendKeys("987654321");
                         
                         
                         


                         
                         WebElement radioBtn2 = driver.findElement(By.id("userRegistrationForm:resAndOff:1"));
                         
                                    radioBtn2.click();
            }

private static void fail(String string)
{
            // TODO Auto-generated method stub
            System.out.println("fail");
}

}

