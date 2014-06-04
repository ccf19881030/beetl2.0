package org.beetl.core.tag;

import org.beetl.core.BasicTestCase;
import org.beetl.core.Template;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class HtmlVarBinddingTagTest extends BasicTestCase
{

	@Test
	public void testEmptyTag() throws Exception
	{

		//将默认搜索路径更改到tag目录下
		gt.registerTag("tagbinding", VarBindingSampleTag.class);

		Template t = gt.getTemplate("/tag/binding/tagbinding_template.html");
		String str = t.render();
		AssertJUnit.assertEquals(this.getFileContent("/tag/binding/tagbinding_expected.html"), str);

		t = gt.getTemplate("/tag/binding/tagbinding_template.html");
		str = t.render();
		AssertJUnit.assertEquals(this.getFileContent("/tag/binding/tagbinding_expected.html"), str);

	}

}
