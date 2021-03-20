import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class Principal {//CLASSE PRINCIPAL
	
	static WebDriver driver;
	
	public static void main(String[] args) {//METODO PRINCIPAL
	abrirChrome();//CHAMANDO O METODO ABRIRCHROME
	}

	private static void abrirChrome() {//METODO ABRIRCHROME
	
	File file = new File("/home/bruno/Área de Trabalho/DesafioConductorQA/TestesFront/chromedriver.exe"); //IMPORTAÇÃO DO ARQUIVO DO DRIVER DIRETAMENTE DA PASTA ONDE ELE FOI ALOCADO
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());//SETANDO A PROPRIEDADE “WEBDRIVER.CHROME.DRIVER” NAS PROPRIEDADES DO SISTEMA COM O VALOR DO CAMINHO DO DRIVER, PARA QUE O SELENIUM POSSA ENCONTRAR UMA INSTÂNCIA CORRETA DA CLASSE CHROMEDRIVER
	WebDriver driver = new ChromeDriver(); //PARA ABRIR UMA INSTÂNCIA DO BROWSER CHROME
	driver.get("http://provaqa.marketpay.com.br:9083/desafioqa/login"); //ACESSO AO SITE A SER TESTADO
	
	//TESTANDO ENTRADA COM USUÁRIO QUALQUER
	WebElement idlogin = driver.findElement(By.name("username")); //LOGIN
	idlogin.sendKeys("lucas@gmail"); //VALOR INSERIDO NO CAMPO LOGIN
	WebElement valor_senha = driver.findElement(By.name("password"));//SENHA
	valor_senha.sendKeys("12345"); //VALOR INSERIDO NO CAMPO DA SENHA
	WebElement botao_singin = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/footer/button")); 
	botao_singin.click(); //CLICANDO NO BOTÃO SIGN IN
	
	driver.navigate().refresh(); //COMANDO PARA ATUALIZAÇÃO DE PAGINA
	
	//TESTANDO ACESSO COM APENAS O USERNAME
	WebElement idlogin_2 = driver.findElement(By.name("username")); //LOGIN
	idlogin_2.sendKeys("joao@gmail");//VALOR INSERIDO NO CAMPO LOGIN
	WebElement botao_singin_2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/footer/button")); 
	botao_singin_2.click(); //CLICANDO NO BOTÃO SIGN IN
	
	driver.navigate().refresh();//COMANDO PARA ATUALIZAÇÃO DE PAGINA
	
	//TESTANDO ACESSO COM APENAS O PASSWORD
	WebElement valor_senha_2 = driver.findElement(By.name("password"));//SENHA
	valor_senha_2.sendKeys("carlos754896"); //VALOR INSERIDO NO CAMPO DA SENHA
	WebElement botao_singin_3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/footer/button")); 
	botao_singin_3.click();//CLICANDO NO BOTÃO SIGN IN
	}	
}			