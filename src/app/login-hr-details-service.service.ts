import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AdminDetails } from './admin-details';

@Injectable({
  providedIn: 'root'
})
export class LoginHrDetailsServiceService {

  constructor(private _http : HttpClient) { }


  public loginUserFromRemote(adminDetails:AdminDetails):Observable<any>{
    return this._http.post<any>("http://localhost:8080/api/admin/login",adminDetails)
   }
}
