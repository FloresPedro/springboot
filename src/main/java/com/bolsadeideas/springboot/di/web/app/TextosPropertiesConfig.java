package com.bolsadeideas.springboot.di.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:texto.properties")
	//@PropertySource("classpath:app.properties") --pueden registrarse varios archivos
})

//clase para configurar mas archivos de configuracion e inyectar con Value
public class TextosPropertiesConfig {

}
