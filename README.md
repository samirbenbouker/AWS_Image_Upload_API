# AWS_Image_Upload_API
Application to upload and download files (images) for a react front end application. Implemented everything from scratch using Spring Boot for the backend and Amazon S3 for storing files (images). For the front he will use react and hooks.

```
WARNING: The project itself does not work since it would lack the AWS credentials that I currently do not have.
It was just a practice with Amazon services
```

## Path Java Project:
`AWS_Image_Upload_API/src/main/java/com/fullStackApi/aws_imageupload/`

## Path React Project:
`AWS_Image_Upload_API/src/main/frontend`

## Endpoints API:
```
PATH: localhost:8080/api/v1/user-profile
```
### Get User Profile
_This endpoint return all users we found in local database_
<table>
  <tr>
    <th>Response: Array[UserProfile]</th>
  </tr>
  <tr>
    <th>Get / </th>
  </tr>
  <tr>
    <td>No parameters required</td>
  </tr>
</table>

### Post Upload Profile Image with Id
_This endpoint can update profile image user with that id we passed_
<table>
  <tr>
    <th colspan="4" >Response: void</th>
  </tr>
  <tr>
    <th colspan="4" >Post /{userProfileId}/image/upload </th>
  </tr>
    <tr>
    <th>Param</th>
    <th>Values</th>
    <th>Description</th>
    <th>Required</th>
  </tr>
  <tr>
    <td>userProfileId</td>
    <td>UUID</td>
    <td>Contains the id of the user</td>
    <td>Yes</td>
  </tr>
</table>

### Get Download User Profile Image
_This endpoint can download user profile image with that id we passed_
<table>
  <tr>
    <th colspan="4" >Response: byte[]</th>
  </tr>
  <tr>
    <th colspan="4" >Get /{userProfileId}/image/download </th>
  </tr>
    <tr>
    <th>Param</th>
    <th>Values</th>
    <th>Description</th>
    <th>Required</th>
  </tr>
  <tr>
    <td>userProfileId</td>
    <td>UUID</td>
    <td>Contains the id of the user</td>
    <td>Yes</td>
  </tr>
</table>
