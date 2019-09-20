package com.upp.config;

import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * 配置国际化语言
 */
@Configuration
public class LocaleConfig {
	
//	@Bean
//	public MessageSourceSupport messageSourceSupport(){
//		ReloadableResourceBundleMessageSource messageSourceSupport = new ReloadableResourceBundleMessageSource();
//		messageSourceSupport.setBasename("classpath:errorCode");
//		messageSourceSupport.setDefaultEncoding("UTF-8");
//		return messageSourceSupport;
//	}
    /**
     * 默认解析器 其中locale表示默认语言
     */
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.CHINA);
        return localeResolver;
    }

    /**
     * 默认拦截器 其中lang表示切换语言的参数名
     */
    @Bean
    public WebMvcConfigurer localeInterceptor() {
        return new WebMvcConfigurer() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
                localeInterceptor.setParamName("lang");
                registry.addInterceptor(localeInterceptor);
            }

			@Override
			public void addArgumentResolvers(List<HandlerMethodArgumentResolver> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addCorsMappings(CorsRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addFormatters(FormatterRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addResourceHandlers(ResourceHandlerRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addViewControllers(ViewControllerRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureAsyncSupport(AsyncSupportConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureContentNegotiation(ContentNegotiationConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureDefaultServletHandling(DefaultServletHandlerConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureMessageConverters(List<HttpMessageConverter<?>> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configurePathMatch(PathMatchConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureViewResolvers(ViewResolverRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void extendMessageConverters(List<HttpMessageConverter<?>> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public MessageCodesResolver getMessageCodesResolver() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Validator getValidator() {
				// TODO Auto-generated method stub
				return null;
			}
        };
    }
}
