import { TestBed } from '@angular/core/testing';

import { Dvr1serviceService } from './dvr1service.service';

describe('Dvr1serviceService', () => {
  let service: Dvr1serviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Dvr1serviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
