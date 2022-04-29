import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Advertisements } from '../models/advertisements';

@Injectable({
  providedIn: 'root'
})
export class AdvertisementService {

  constructor(private http:HttpClient) {}

  getAdveritesements() : Observable<Advertisements[]>{
    return this.http.get<Advertisements[]>('http://localhost:8080/');
  }
}
