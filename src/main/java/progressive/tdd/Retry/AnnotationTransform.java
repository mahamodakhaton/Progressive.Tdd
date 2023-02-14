package progressive.tdd.Retry;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation; 
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class AnnotationTransform implements IAnnotationTransformer{
	@SuppressWarnings("rawtypes")
	@Override
	public void transform(ITestAnnotation annotation,Class testClass,Constructor TestConstructor,Method TestMethod) {
		annotation.getRetryAnalyzerClass();
	}

}
