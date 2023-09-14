import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Dvr1Detail } from './dvr1-detail';
import { Observable } from 'rxjs';
import { AdminDetails } from './admin-details';
import { Dvr } from './dvr';

@Injectable({
  providedIn: 'root'
})
export class Dvr1serviceService {

  constructor(public http:HttpClient) { }

public getAllDvr1DetailsService():Observable<Dvr[]>{
  return this.http.get<Dvr[]>("http://localhost:8080/api/dvr1new")
}
public getAllDvr2DetailsService():Observable<Dvr[]>{
  return this.http.get<Dvr[]>("http://localhost:8080/api/dvr2/dvr2newlist")
}
public getAllDvr3DetailsService():Observable<Dvr[]>{
  return this.http.get<Dvr[]>("http://localhost:8080/api/dvr3/dvr3newlist")
}

public getAllDvrDetailsService(dvr:any,from:any,to:any):Observable<Dvr1Detail[]>{
  return this.http.get<Dvr1Detail[]>("http://localhost:8080/api/"+dvr+"/"+from+"/"+to)
}
private url="http://localhost:8080/api/dvr1new";
private url1="http://localhost:8080/api/dvr2/new";
private url2="http://localhost:8080/api/dvr3/new";
public createNewDvr1(dvr:Dvr,id:any):Observable<any>{
  return this.http.post<any>(`${this.url}/${id}`,dvr);
}
public createNewDvr2(dvr:Dvr,id:any):Observable<any>{
  return this.http.post<any>(`${this.url1}/${id}`,dvr);
}
public createNewDvr3(dvr:Dvr,id:any):Observable<any>{
  return this.http.post<any>(`${this.url2}/${id}`,dvr);
}

public saveAllDvr1Details(dvrdetails:Dvr1Detail):Observable<any>{
  return this.http.post<any>("http://localhost:8080/api/dvr1/saveall",dvrdetails);
}

public saveAllDvr2Details(dvrdetails:Dvr1Detail):Observable<any>{
  return this.http.post<any>("http://localhost:8080/api/dvr2/saveall",dvrdetails);
}

}
