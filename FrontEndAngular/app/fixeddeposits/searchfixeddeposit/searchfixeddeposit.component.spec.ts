import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchfixeddepositComponent } from './searchfixeddeposit.component';

describe('SearchfixeddepositComponent', () => {
  let component: SearchfixeddepositComponent;
  let fixture: ComponentFixture<SearchfixeddepositComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchfixeddepositComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchfixeddepositComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
