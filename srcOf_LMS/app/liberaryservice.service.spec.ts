import { TestBed } from '@angular/core/testing';

import { LiberaryserviceService } from './liberaryservice.service';

describe('LiberaryserviceService', () => {
  let service: LiberaryserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LiberaryserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
