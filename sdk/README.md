<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://fbn-prd.lusid.com/access*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationMetadataApi* | [**listAccessControlledResources**](docs/ApplicationMetadataApi.md#listaccesscontrolledresources) | **GET** /api/metadata/access/resources | ListAccessControlledResources: Get resources available for access control
*PoliciesApi* | [**addToPolicyCollection**](docs/PoliciesApi.md#addtopolicycollection) | **POST** /api/policycollections/{code}/add | AddToPolicyCollection: Add To PolicyCollection
*PoliciesApi* | [**createPolicy**](docs/PoliciesApi.md#createpolicy) | **POST** /api/policies | CreatePolicy: Create Policy
*PoliciesApi* | [**createPolicyCollection**](docs/PoliciesApi.md#createpolicycollection) | **POST** /api/policycollections | CreatePolicyCollection: Create PolicyCollection
*PoliciesApi* | [**deletePolicy**](docs/PoliciesApi.md#deletepolicy) | **DELETE** /api/policies/{code} | DeletePolicy: Delete Policy
*PoliciesApi* | [**deletePolicyCollection**](docs/PoliciesApi.md#deletepolicycollection) | **DELETE** /api/policycollections/{code} | DeletePolicyCollection: Delete PolicyCollection
*PoliciesApi* | [**evaluate**](docs/PoliciesApi.md#evaluate) | **POST** /api/me | Evaluate: Run one or more evaluations
*PoliciesApi* | [**getOwnPolicies**](docs/PoliciesApi.md#getownpolicies) | **GET** /api/me | GetOwnPolicies: Get policies of requesting user
*PoliciesApi* | [**getPolicy**](docs/PoliciesApi.md#getpolicy) | **GET** /api/policies/{code} | GetPolicy: Get Policy
*PoliciesApi* | [**getPolicyCollection**](docs/PoliciesApi.md#getpolicycollection) | **GET** /api/policycollections/{code} | GetPolicyCollection: Get PolicyCollection
*PoliciesApi* | [**listPolicies**](docs/PoliciesApi.md#listpolicies) | **GET** /api/policies | ListPolicies: List Policies
*PoliciesApi* | [**listPolicyCollections**](docs/PoliciesApi.md#listpolicycollections) | **GET** /api/policycollections | ListPolicyCollections: List PolicyCollections
*PoliciesApi* | [**pagePolicies**](docs/PoliciesApi.md#pagepolicies) | **GET** /api/policies/page | PagePolicies: Page Policies
*PoliciesApi* | [**pagePolicyCollections**](docs/PoliciesApi.md#pagepolicycollections) | **GET** /api/policycollections/page | PagePolicyCollections: Page PolicyCollections
*PoliciesApi* | [**removeFromPolicyCollection**](docs/PoliciesApi.md#removefrompolicycollection) | **POST** /api/policycollections/{code}/remove | RemoveFromPolicyCollection: Remove From PolicyCollection
*PoliciesApi* | [**updatePolicy**](docs/PoliciesApi.md#updatepolicy) | **PUT** /api/policies/{code} | UpdatePolicy: Update Policy
*PoliciesApi* | [**updatePolicyCollection**](docs/PoliciesApi.md#updatepolicycollection) | **PUT** /api/policycollections/{code} | UpdatePolicyCollection: Update PolicyCollection
*PolicyTemplatesApi* | [**createPolicyTemplate**](docs/PolicyTemplatesApi.md#createpolicytemplate) | **POST** /api/policytemplates | [EXPERIMENTAL] CreatePolicyTemplate: Create a Policy Template
*PolicyTemplatesApi* | [**deletePolicyTemplate**](docs/PolicyTemplatesApi.md#deletepolicytemplate) | **DELETE** /api/policytemplates/{code} | [EXPERIMENTAL] DeletePolicyTemplate: Deleting a policy template
*PolicyTemplatesApi* | [**generatePolicyFromTemplate**](docs/PolicyTemplatesApi.md#generatepolicyfromtemplate) | **POST** /api/policytemplates/$generatepolicy | [EXPERIMENTAL] GeneratePolicyFromTemplate: Generate policy from template
*PolicyTemplatesApi* | [**getPolicyTemplate**](docs/PolicyTemplatesApi.md#getpolicytemplate) | **GET** /api/policytemplates/{code} | [EXPERIMENTAL] GetPolicyTemplate: Retrieving one Policy Template
*PolicyTemplatesApi* | [**listPolicyTemplates**](docs/PolicyTemplatesApi.md#listpolicytemplates) | **GET** /api/policytemplates | [EXPERIMENTAL] ListPolicyTemplates: List Policy Templates
*PolicyTemplatesApi* | [**updatePolicyTemplate**](docs/PolicyTemplatesApi.md#updatepolicytemplate) | **PUT** /api/policytemplates/{code} | [EXPERIMENTAL] UpdatePolicyTemplate: Update a Policy Template
*RolesApi* | [**addPolicyCollectionToRole**](docs/RolesApi.md#addpolicycollectiontorole) | **POST** /api/roles/{scope}/{code}/policycollections | AddPolicyCollectionToRole: Add policy collections to a role
*RolesApi* | [**createRole**](docs/RolesApi.md#createrole) | **POST** /api/roles | CreateRole: Create Role
*RolesApi* | [**deleteRole**](docs/RolesApi.md#deleterole) | **DELETE** /api/roles/{code} | DeleteRole: Delete Role
*RolesApi* | [**getRole**](docs/RolesApi.md#getrole) | **GET** /api/roles/{code} | GetRole: Get Role
*RolesApi* | [**listRoles**](docs/RolesApi.md#listroles) | **GET** /api/roles | ListRoles: List Roles
*RolesApi* | [**removePolicyCollectionFromRole**](docs/RolesApi.md#removepolicycollectionfromrole) | **DELETE** /api/roles/{scope}/{code}/policycollections/{policycollectionscope}/{policycollectioncode} | RemovePolicyCollectionFromRole: Remove policy collection from role
*RolesApi* | [**updateRole**](docs/RolesApi.md#updaterole) | **PUT** /api/roles/{code} | UpdateRole: Update Role
*UserRolesApi* | [**addPolicyCollectionToUserRole**](docs/UserRolesApi.md#addpolicycollectiontouserrole) | **POST** /api/userroles/{userid}/policycollections | AddPolicyCollectionToUserRole: Add a policy collection to a user-role
*UserRolesApi* | [**addPolicyToUserRole**](docs/UserRolesApi.md#addpolicytouserrole) | **POST** /api/userroles/{userid}/policies | AddPolicyToUserRole: Add a policy to a user-role
*UserRolesApi* | [**createUserRole**](docs/UserRolesApi.md#createuserrole) | **POST** /api/userroles | CreateUserRole: Create a user-role
*UserRolesApi* | [**deleteUserRole**](docs/UserRolesApi.md#deleteuserrole) | **DELETE** /api/userroles/{userid} | DeleteUserRole: Delete a user-role
*UserRolesApi* | [**getUserRole**](docs/UserRolesApi.md#getuserrole) | **GET** /api/userroles/{userid} | GetUserRole: Get a user-role
*UserRolesApi* | [**listUserRoles**](docs/UserRolesApi.md#listuserroles) | **GET** /api/userroles | ListUserRoles: List user-roles
*UserRolesApi* | [**removePolicyCollectionFromUserRole**](docs/UserRolesApi.md#removepolicycollectionfromuserrole) | **DELETE** /api/userroles/{userid}/policycollections/{policyCollectionScope}/{policyCollectionCode} | RemovePolicyCollectionFromUserRole: Remove a policy collection from a user-role
*UserRolesApi* | [**removePolicyFromUserRole**](docs/UserRolesApi.md#removepolicyfromuserrole) | **DELETE** /api/userroles/{userid}/policies/{policyScope}/{policyCode} | RemovePolicyFromUserRole: Remove a policy from a user-role
*UserRolesApi* | [**updateUserRole**](docs/UserRolesApi.md#updateuserrole) | **POST** /api/userroles/{userid}/update | UpdateUserRole: Update a user-role


<a id="documentation-for-models"></a>
## Documentation for Models

 - [AccessControlledAction](docs/AccessControlledAction.md)
 - [AccessControlledResource](docs/AccessControlledResource.md)
 - [ActionId](docs/ActionId.md)
 - [AddPolicyCollectionToRoleRequest](docs/AddPolicyCollectionToRoleRequest.md)
 - [AddPolicyToRoleRequest](docs/AddPolicyToRoleRequest.md)
 - [AddToPolicyCollectionRequest](docs/AddToPolicyCollectionRequest.md)
 - [AsAtPredicateContract](docs/AsAtPredicateContract.md)
 - [AsAtRangeForSpec](docs/AsAtRangeForSpec.md)
 - [AsAtRelative](docs/AsAtRelative.md)
 - [AttachedPolicyDefinitionResponse](docs/AttachedPolicyDefinitionResponse.md)
 - [DateQuality](docs/DateQuality.md)
 - [DateUnit](docs/DateUnit.md)
 - [EffectiveDateHasQuality](docs/EffectiveDateHasQuality.md)
 - [EffectiveDateRelative](docs/EffectiveDateRelative.md)
 - [EffectiveRange](docs/EffectiveRange.md)
 - [EntitlementMetadata](docs/EntitlementMetadata.md)
 - [EvaluationRequest](docs/EvaluationRequest.md)
 - [EvaluationResponse](docs/EvaluationResponse.md)
 - [EvaluationResult](docs/EvaluationResult.md)
 - [ForSpec](docs/ForSpec.md)
 - [GeneratePolicyFromTemplateRequest](docs/GeneratePolicyFromTemplateRequest.md)
 - [GeneratedPolicyComponents](docs/GeneratedPolicyComponents.md)
 - [Grant](docs/Grant.md)
 - [HowSpec](docs/HowSpec.md)
 - [IdSelectorDefinition](docs/IdSelectorDefinition.md)
 - [IdentifierPartSchema](docs/IdentifierPartSchema.md)
 - [IfExpression](docs/IfExpression.md)
 - [IfFeatureChainExpression](docs/IfFeatureChainExpression.md)
 - [IfIdentityClaimExpression](docs/IfIdentityClaimExpression.md)
 - [IfIdentityScopeExpression](docs/IfIdentityScopeExpression.md)
 - [IfRequestHeaderExpression](docs/IfRequestHeaderExpression.md)
 - [KeyValuePairOfStringToString](docs/KeyValuePairOfStringToString.md)
 - [Link](docs/Link.md)
 - [LusidProblemDetails](docs/LusidProblemDetails.md)
 - [LusidValidationProblemDetails](docs/LusidValidationProblemDetails.md)
 - [MatchAllSelectorDefinition](docs/MatchAllSelectorDefinition.md)
 - [MetadataExpression](docs/MetadataExpression.md)
 - [MetadataSelectorDefinition](docs/MetadataSelectorDefinition.md)
 - [NonTransitiveSupervisorRoleResource](docs/NonTransitiveSupervisorRoleResource.md)
 - [Operator](docs/Operator.md)
 - [PointInTimeSpecification](docs/PointInTimeSpecification.md)
 - [PolicyCollectionCreationRequest](docs/PolicyCollectionCreationRequest.md)
 - [PolicyCollectionId](docs/PolicyCollectionId.md)
 - [PolicyCollectionResponse](docs/PolicyCollectionResponse.md)
 - [PolicyCollectionUpdateRequest](docs/PolicyCollectionUpdateRequest.md)
 - [PolicyCreationRequest](docs/PolicyCreationRequest.md)
 - [PolicyId](docs/PolicyId.md)
 - [PolicyIdRoleResource](docs/PolicyIdRoleResource.md)
 - [PolicyResponse](docs/PolicyResponse.md)
 - [PolicySelectorDefinition](docs/PolicySelectorDefinition.md)
 - [PolicyTemplateCreationRequest](docs/PolicyTemplateCreationRequest.md)
 - [PolicyTemplateResponse](docs/PolicyTemplateResponse.md)
 - [PolicyTemplateUpdateRequest](docs/PolicyTemplateUpdateRequest.md)
 - [PolicyTemplatedSelector](docs/PolicyTemplatedSelector.md)
 - [PolicyType](docs/PolicyType.md)
 - [PolicyUpdateRequest](docs/PolicyUpdateRequest.md)
 - [RelativeToDateTime](docs/RelativeToDateTime.md)
 - [RemoveFromPolicyCollectionRequest](docs/RemoveFromPolicyCollectionRequest.md)
 - [RequestDetails](docs/RequestDetails.md)
 - [RequestedActionKey](docs/RequestedActionKey.md)
 - [ResourceDetails](docs/ResourceDetails.md)
 - [ResourceListOfAccessControlledResource](docs/ResourceListOfAccessControlledResource.md)
 - [ResourceListOfPolicyCollectionResponse](docs/ResourceListOfPolicyCollectionResponse.md)
 - [ResourceListOfPolicyResponse](docs/ResourceListOfPolicyResponse.md)
 - [ResourceListOfPolicyTemplateResponse](docs/ResourceListOfPolicyTemplateResponse.md)
 - [ResourceListOfUserRoleResponse](docs/ResourceListOfUserRoleResponse.md)
 - [RoleCreationRequest](docs/RoleCreationRequest.md)
 - [RoleId](docs/RoleId.md)
 - [RoleResourceRequest](docs/RoleResourceRequest.md)
 - [RoleResponse](docs/RoleResponse.md)
 - [RoleUpdateRequest](docs/RoleUpdateRequest.md)
 - [SelectorDefinition](docs/SelectorDefinition.md)
 - [TemplateMetadata](docs/TemplateMetadata.md)
 - [TemplateSelection](docs/TemplateSelection.md)
 - [TextOperator](docs/TextOperator.md)
 - [UserRoleCreationRequest](docs/UserRoleCreationRequest.md)
 - [UserRoleResponse](docs/UserRoleResponse.md)
 - [UserRoleUpdateRequest](docs/UserRoleUpdateRequest.md)
 - [WhenSpec](docs/WhenSpec.md)

