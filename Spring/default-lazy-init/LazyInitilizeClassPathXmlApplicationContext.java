public class LazyInitilizeClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
  public LazyInitilizeClassPathXmlApplicationContext(String[] configLocations, ApplicationContext parent) throws BeansException {
		super(configLocations, parent);
	}
 
  /**
   * @see org.springframework.context.support.AbstractXmlApplicationContext#initBeanDefinitionReader(org.springframework.beans.factory.xml.XmlBeanDefinitionReader)
   */
  @Override
  protected void initBeanDefinitionReader(XmlBeanDefinitionReader reader) {
    // TODO Auto-generated method stub
    super.initBeanDefinitionReader(reader);
    reader.setDocumentReaderClass(LazyDefaultBeanDefinitionDocumentReader.class);
  }

}
