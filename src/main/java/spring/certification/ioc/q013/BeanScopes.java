package spring.certification.ioc.q013;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import spring.certification.ioc.q013.example.ScopeConfiguration;

/**
 * Spring v5.0 Professional Certification.
 * <p>
 * Question 013:<br>
 * Describe scopes for Spring beans. What is the default scope?<br>
 * <p>
 * Answer:<br>
 * Spring Framework offers several bean scopes:<br>
 * Stand-alone application scopes:<br>
 * 1. Singleton scope - bean definition is used to create only one bean which is unique within an
 * {@link ApplicationContext}.  This scope is the <b>default</b> one.<br>
 * 2. Prototype scope - bean definition is used to create any number of beans that is requested. This is actually a
 * 'rough' replacement for the Java 'new' operator.<br>
 * <p>
 * Additional web-application scopes:<br>
 * 3. Request scope - bean definition is used to create a bean for each HTTP request ({@link RequestScope} annotation).<br>
 * 4. Session scope - bean definition is used to create a bean for each HTTP session ({@link SessionScope} annotation).<br>
 * 5. Application scope - bean definition is used to create a bean for the lifecycle of a ServletContext ({@link ApplicationScope} annotation).<br>
 * 6. Websocket scope - bean definition is used to create a bean for the lifecycle of a Websocket.<br>
 * <p>
 * In annotation-based configuration these scopes can be chosen by using {@link Scope} annotation with provided scope
 * name.<br>
 * Examples of mentioned terms:<br>
 * {@link ScopeConfiguration} - demonstrates basic usage of bean {@link Scope scopes}.
 *
 * @author Valentine Shemyako
 * @since November 21, 2018
 */
public class BeanScopes {
}
