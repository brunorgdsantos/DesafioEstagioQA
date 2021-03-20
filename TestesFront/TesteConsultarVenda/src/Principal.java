import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class Principal {
	
	public static void main(String[] args) {//METODO PRINCIPAL
		abrirChrome();//CHAMANDO O METODO ABRIRCHROME
	}

	public static void abrirChrome() {//TESTE: CADASTRO COM CAMPO OBRIGATORIO(SALDO) EM BRANCO
	
	File file = new File("/home/bruno/Área de Trabalho/DesafioConductorQA/TestesFront/chromedriver.exe"); //IMPORTAÇÃO DO ARQUIVO DO DRIVER DIRETAMENTE DA PASTA ONDE ELE FOI ALOCADO
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());//SETANDO A PROPRIEDADE “WEBDRIVER.CHROME.DRIVER” NAS PROPRIEDADES DO SISTEMA COM O VALOR DO CAMINHO DO DRIVER, PARA QUE O SELENIUM POSSA ENCONTRAR UMA INSTÂNCIA CORRETA DA CLASSE CHROMEDRIVER
	WebDriver driver = new ChromeDriver(); //PARA ABRIR UMA INSTÂNCIA DO BROWSER CHROME
	driver.get("http://provaqa.marketpay.com.br:9083/desafioqa/login");//ACESSO AO SITE A SER TESTADO 
	
	//ENTRANDO NO SITE COM USUÁRIO ID:ADMIN, SENHA:ADMIN
	WebElement idlogin = driver.findElement(By.name("username")); //LOGIN
	idlogin.sendKeys("admin");//VALOR INSERIDO NO CAMPO LOGIN
	WebElement valor_senha = driver.findElement(By.name("password"));//SENHA
	valor_senha.sendKeys("admin");//VALOR INSERIDO NO CAMPO DA SENHA
	WebElement botao_singin = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/footer/button")); 
	botao_singin.click();//CLICANDO NO BOTÃO SIGN IN
	
	//TESTANDO ENTRADA COM USUÁRIO INEXISTENTE
	WebElement campo3a = driver.findElement(By.xpath("/html/body/aside/nav/ul[2]/li/a/i")); 
	campo3a.click();
	WebElement campo4 = driver.findElement(By.xpath("/html/body/aside/nav/ul[2]/li/ul/li[2]/a/span")); 
	campo4.click();
	WebElement campo5 = driver.findElement(By.xpath("/html/body/aside/nav/ul[2]/li/ul/li[2]/ul/li[2]/a/span"));
	campo5.click();
	
	//TESTANDO ENTRADA COM USUÁRIO INEXISTENTE
	WebElement campo6 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form[2]/div/div/fieldset[1]/div/div/div/select/option[1]")); 
	campo6.click();
	WebElement campo7 = driver.findElement(By.name("j_idt20")); 
	campo7.click();
	}
}
