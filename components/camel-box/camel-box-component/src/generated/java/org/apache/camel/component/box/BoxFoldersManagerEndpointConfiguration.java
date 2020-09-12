
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.box.api.BoxFoldersManager
 */
@ApiParams(apiName = "folders", apiMethods = {@ApiMethod(methodName = "copyFolder"), @ApiMethod(methodName = "createFolder"), @ApiMethod(methodName = "createFolderSharedLink"), @ApiMethod(methodName = "deleteFolder"), @ApiMethod(methodName = "getFolder"), @ApiMethod(methodName = "getFolderInfo"), @ApiMethod(methodName = "getFolderItems"), @ApiMethod(methodName = "getRootFolder"), @ApiMethod(methodName = "moveFolder"), @ApiMethod(methodName = "renameFolder"), @ApiMethod(methodName = "updateFolderInfo")})
@UriParams
@Configurer
public final class BoxFoldersManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam
    @ApiParam(apiMethods = "createFolderSharedLink", description = "The access level of the shared link")
    private com.box.sdk.BoxSharedLink.Access access;
    @UriParam
    @ApiParam(apiMethods = "copyFolder,moveFolder", description = "The id of the destination folder")
    private String destinationFolderId;
    @UriParam
    @ApiParam(apiMethods = "getFolderInfo,getFolderItems", description = "The information fields to retrieve; if null all information fields are retrieved.")
    private String[] fields;
    @UriParam
    @ApiParam(apiMethods = "copyFolder,createFolderSharedLink,deleteFolder,getFolderInfo,getFolderItems,moveFolder,renameFolder,updateFolderInfo", description = "The id of folder to copy")
    private String folderId;
    @UriParam
    @ApiParam(apiMethods = "createFolder", description = "The name of created folder")
    private String folderName;
    @UriParam
    @ApiParam(apiMethods = "updateFolderInfo", description = "The updated information")
    private com.box.sdk.BoxFolder.Info info;
    @UriParam
    @ApiParam(apiMethods = "getFolderItems", description = "The maximum number of children to retrieve after the offset; if null all child items are retrieved.")
    private Long limit;
    @UriParam
    @ApiParam(apiMethods = "renameFolder", description = "The new name of folder")
    private String newFolderName;
    @UriParam
    @ApiParam(apiMethods = "copyFolder,moveFolder", description = "The new name for copied folder; if newName is null, the copied folder has same name as the original.")
    private String newName;
    @UriParam
    @ApiParam(apiMethods = "getFolderItems", description = "The index of first child item to retrieve; if null all child items are retrieved.")
    private Long offset;
    @UriParam
    @ApiParam(apiMethods = "createFolder", description = "The id of parent folder")
    private String parentFolderId;
    @UriParam
    @ApiParam(apiMethods = "createFolder,getFolder", description = "Sequence of Box folder names from parent folder to returned folder")
    private String[] path;
    @UriParam
    @ApiParam(apiMethods = "createFolderSharedLink", description = "The permissions of the created link; if permissions is null then the created shared link is create with default permissions.")
    private com.box.sdk.BoxSharedLink.Permissions permissions;
    @UriParam
    @ApiParam(apiMethods = "createFolderSharedLink", description = "The date and time at which time the created shared link will expire; if unsharedDate is null then a non-expiring link is created.")
    private java.util.Date unshareDate;

    public com.box.sdk.BoxSharedLink.Access getAccess() {
        return access;
    }

    public void setAccess(com.box.sdk.BoxSharedLink.Access access) {
        this.access = access;
    }

    public String getDestinationFolderId() {
        return destinationFolderId;
    }

    public void setDestinationFolderId(String destinationFolderId) {
        this.destinationFolderId = destinationFolderId;
    }

    public String[] getFields() {
        return fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public com.box.sdk.BoxFolder.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxFolder.Info info) {
        this.info = info;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public String getNewFolderName() {
        return newFolderName;
    }

    public void setNewFolderName(String newFolderName) {
        this.newFolderName = newFolderName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public String getParentFolderId() {
        return parentFolderId;
    }

    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    public String[] getPath() {
        return path;
    }

    public void setPath(String[] path) {
        this.path = path;
    }

    public com.box.sdk.BoxSharedLink.Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(com.box.sdk.BoxSharedLink.Permissions permissions) {
        this.permissions = permissions;
    }

    public java.util.Date getUnshareDate() {
        return unshareDate;
    }

    public void setUnshareDate(java.util.Date unshareDate) {
        this.unshareDate = unshareDate;
    }
}
