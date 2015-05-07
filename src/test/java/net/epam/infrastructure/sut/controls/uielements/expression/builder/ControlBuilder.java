package net.epam.infrastructure.sut.controls.uielements.expression.builder;

import net.epam.infrastructure.sut.controls.uielements.*;
import net.epam.infrastructure.sut.controls.uielements.conditions.ConditionForAbsence;
import net.epam.infrastructure.sut.controls.uielements.search.contexts.ContextForClickable;
import net.epam.infrastructure.sut.controls.uielements.search.contexts.ContextForExistent;
import net.epam.infrastructure.sut.controls.uielements.search.contexts.ContextForVisible;


public final class ControlBuilder implements IControlBuilderStep1, IControlBuilderStep2,
        IControlBuilderStep3, IControlBuilderStep4 {

    private final Location location;
    private String name;
    private ISearchContext searchContext;
    private ICondition elementIsAbsent;
    private Class controlType;

    public ControlBuilder(Location location, String name) {
        this.location = location;
        this.name = name;
    }

    public ControlBuilder(Location location) {
        this.location = location;
    }

    public static IControlBuilderStep1 setById(String id) {
        return new ControlBuilder(Location.getById(id));
    }

    public static IControlBuilderStep1 setByTagName(String tagname) {
        return new ControlBuilder(Location.getByTagName(tagname));
    }

    public static IControlBuilderStep1 setByName(String searchName) {
        return new ControlBuilder(Location.getByName(searchName));
    }

    public static IControlBuilderStep1 setByXPath(String xpathExpression) {
        return new ControlBuilder(Location.getByXPath(xpathExpression));
    }

    public static IControlBuilderStep1 setByCssSelector(String selector) {
        return new ControlBuilder(Location.getByCssSelector(selector));
    }

    public static IControlBuilderStep1 setByClassName(String className) {
        return new ControlBuilder(Location.getByClassName(className));
    }

    public IControlBuilderStep2 setName(String name) {
        this.name = name;
        return this;
    }

    public static IControlBuilderStep2 setById(String id, String name) {
        return new ControlBuilder(Location.getById(id), name);
    }

    public static IControlBuilderStep2 setByTagName(String tagname, String name) {
        return new ControlBuilder(Location.getByTagName(tagname), name);
    }

    public static IControlBuilderStep2 setByName(String searchName, String name) {
        return new ControlBuilder(Location.getByName(searchName), name);
    }

    public static IControlBuilderStep2 setByXPath(String xpathExpression, String name) {
        return new ControlBuilder(Location.getByXPath(xpathExpression), name);
    }

    public static IControlBuilderStep2 setByCssSelector(String selector, String name) {
        return new ControlBuilder(Location.getByCssSelector(selector), name);
    }

    public static IControlBuilderStep2 setByClassName(String className, String name) {
        return new ControlBuilder(Location.getByClassName(className), name);
    }

    public IControlBuilderStep3 setVisible() {
        searchContext = ContextForVisible.get();
        return this;
    }

    public IControlBuilderStep3 setStatic() {
        searchContext = ContextForExistent.get();

        return this;
    }

    public IControlBuilderStep3 setClickable() {
        searchContext = ContextForClickable.get();
        return this;
    }

    public IControlBuilderStep4 setControlType(Class controlClass) {
        controlType = controlClass;
        return this;
    }

    public ControlWrapper build() {
        elementIsAbsent = ConditionForAbsence.get();
        return new ControlWrapper(ControlInfo.create(location, name, controlType), searchContext, elementIsAbsent);
    }

    public HierarchicalControl buildHierarchicalControl() {
        elementIsAbsent = ConditionForAbsence.get();
        return new HierarchicalControl(ControlInfo.create(location, name, controlType), searchContext, elementIsAbsent);
    }

}
