/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.internal.artifacts.dsl;

import org.gradle.api.artifacts.ComponentMetadataContext;
import org.gradle.api.artifacts.ModuleVersionIdentifier;
import org.gradle.internal.action.ConfigurableRule;

import java.util.function.Predicate;

class SpecConfigurableRule {

    private final ConfigurableRule<ComponentMetadataContext> configurableRule;
    private final Predicate<ModuleVersionIdentifier> spec;

    SpecConfigurableRule(ConfigurableRule<ComponentMetadataContext> configurableRule, Predicate<ModuleVersionIdentifier> spec) {

        this.configurableRule = configurableRule;
        this.spec = spec;
    }

    public ConfigurableRule<ComponentMetadataContext> getConfigurableRule() {
        return configurableRule;
    }

    public Predicate<ModuleVersionIdentifier> getSpec() {
        return spec;
    }
}