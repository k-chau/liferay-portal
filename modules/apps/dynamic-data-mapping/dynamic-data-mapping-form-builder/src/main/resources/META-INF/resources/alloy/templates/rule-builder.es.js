import Component from 'metal-component';
import Soy from 'metal-soy';

import templates from './rule-builder.soy';

const RuleBuilderTemplates = [];

if (!window.DDMRuleBuilder) {
	window.DDMRuleBuilder = {

	};
}

for (const template in templates) {
	if (template !== 'templates') {
		class C extends Component {}
		Soy.register(C, templates, template);
		RuleBuilderTemplates.push(
			{
				component: C,
				key: template
			}
		);
		C.Soy = Soy;
		window.DDMRuleBuilder[template] = C;
	}
}

export default RuleBuilderTemplates;