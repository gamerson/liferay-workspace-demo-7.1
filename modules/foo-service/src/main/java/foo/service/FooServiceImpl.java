package foo.service;

import foo.api.FooService;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	service = FooService.class
)
public class FooServiceImpl implements FooService {

	@Override
	public String bar() {
		return "foobar";
	}

}