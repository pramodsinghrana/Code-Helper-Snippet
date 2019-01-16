public class LazyDefaultBeanDefinitionDocumentReader extends DefaultBeanDefinitionDocumentReader {

    @Override
    protected BeanDefinitionParserDelegate createDelegate(XmlReaderContext readerContext, Element root, BeanDefinitionParserDelegate parentDelegate) {
      root.setAttribute("default-lazy-init", "true");
      return super.createDelegate(readerContext, root, parentDelegate);
    }
}
