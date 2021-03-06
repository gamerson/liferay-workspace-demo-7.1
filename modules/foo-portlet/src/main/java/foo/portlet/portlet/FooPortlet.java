package foo.portlet.portlet;

import foo.api.FooService;
import foo.portlet.constants.FooPortletKeys;

import com.google.common.base.Ascii;
import com.google.common.base.Strings;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalService;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author greg
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=foo-portlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + FooPortletKeys.Foo,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FooPortlet extends MVCPortlet {

	public FooPortlet() {
		super();

		Strings.padEnd("foo", 6, ' ');
	}

	@Reference
	UserLocalService user;

	@Reference
	FooService fooService;
}

