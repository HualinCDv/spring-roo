package org.springframework.roo.addon.tailor.actions;

/**
 * Predefined action types. Can be used to avoid spelling mistakes for the
 * action types when creating a TailorConfiguration with Java.
 * 
 * @author Birgitta Boeckeler
 */
public enum ActionType {

    DEFAULTVALUE(DefaultValue.class), EXECUTESELF(ExecuteSelf.class), FOCUSMODULE(
            FocusModule.class), EXECUTECOMMAND(ExecuteCommand.class);

    private Class<?> actionClass;

    ActionType(final Class<?> actionClass) {
        this.actionClass = actionClass;
    }

    public String getActionId() {
        return actionClass.getSimpleName();
    }
}
