import { TestBed } from '@angular/core/testing';

import { LoginHrDetailsServiceService } from './login-hr-details-service.service';

describe('LoginHrDetailsServiceService', () => {
  let service: LoginHrDetailsServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoginHrDetailsServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
