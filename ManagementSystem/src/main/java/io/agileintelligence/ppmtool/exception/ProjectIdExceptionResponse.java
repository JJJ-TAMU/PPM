package io.agileintelligence.ppmtool.exception;

/**
 * ProjectIdExceptionReponse
 *
 * @author JJJ
 * @date 7/19/21 5:40 PM
 * @email jiangjinjinyxt@gmail.com
 * @since 1.0.0
 */
public class ProjectIdExceptionResponse {

    private String projectIdentifier;

    public ProjectIdExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
